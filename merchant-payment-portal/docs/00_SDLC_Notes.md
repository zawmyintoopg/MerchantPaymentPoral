# Requirement Phase

## Feature: Create Merchant

### Business Goal
to create merchant information for bank staff or end user
with merchant segment level

(ဘာကြောင့် ဒီ Feature လိုတာလဲ?)
to management the transation 


### Actor

(ဘယ်သူအသုံးပြုမလဲ?)

bank staff, manager , admin 

### Preconditions

(Create မလုပ်ခင် ဘာတွေရှိရမလဲ?)

user login
permission create role
must be created customer record
must be created merchant segment
must be created merchant bank account 
must validate bank account


### Input

(ဘာ Data တွေ ထည့်ရမလဲ?)

- customer number
- contract number
- customer regdate
- merchant number
- merchant name
- merchant segment
- merchant regdate
- merchant status

### Process

(System က ဘာလုပ်မလဲ?)

validate and null value checking all data
and save in database and return all data

### Output

(User က ဘာရမလဲ?)

registered merchants list
# Analysis Phase

### Business Rules

(ဘာ Rule တွေလိုက်နာရမလဲ?)
Rule ID    Business Rule
BR1     merchant number must be unique
BR2     merchant name required and max 50 char
BR3     merchant_segment_id must have before create a merchant
BR4     contract_id must have before create a merchant
BR5     bank_account_number must validate
BR6     Merchant Registration Date must be current date and save in mer
BR7     Merchant_status is default active

# Design Phase

# Domain Model

# 1. Customer
column name                   data type
- id (pk)                       Long
- customer_name                 String
- customer_registration_date    DateTime
- is_active                     Boolean
- created_at                   DateTime
- updated_at                   DateTime

# 2. Contract
- id (pk)                     Long
- contract_number             String
- customer_id(Fk)             Long
- reg_date                    DateTime
- is_active                   Boolean
- created_at                   DateTime
- updated_at                   DateTime

# 3. BankAccount
- id(pk)                      Long
- bank_account_number         String
- bank_account_name           String
- balance                     Double
- created_at                  DateTime
- updated_at                  DateTime

# 4. Merchant Segment
- id(pk)                       Long
- segment_name                 String
- is_active                    Boolean
- created_at                   DateTime
- updated_at                   DateTime

# 5. Merchant
- id(pk)                       Long
- merchant_number              String
- merchant_name                String
- merchant_reg_date            DateTime
- contract_id(Fk)              Long
- merchant_segment_id(Fk)      Long
- currency                     String
- bank_account_id(Fk)          Long
- merchant_status              String
- merchant_street              String
- merchant_ward                String
- merchant_address             String
- merchant_phone               String
- merchant_type                String
- created_at                   DateTime
- updated_at                   DateTime

# 6. Terminal
- id(pk)                       Long
- terminal_number              String
- serial_number                String
- model_number                 String
- registration_date            DateTime
- terminal_type                String
- merchant_id(Fk)              Long
- created_at                   DateTime
- updated_at                   DateTime


# 7.Terminal_history
- id(pk)
- terminal_id(Fk)              Long
- merchant_id(FK)              Long
- assigned_date                DateTime
- unassigned_date              DateTime
- reason                       String
- created_at                   DateTime
- updated_at                   DateTime

# 8. Transactions
- id(pk)
- transaction_datetime          DateTime
- settlement_datetime           DateTime
- merchant_id(Fk)               Long
- terminal_id(Fk)               Long
- transaction_amount            BigDecimal
- ref (unique)                  String
- mdr_fee                       BigDecimal
- net_amount                    BigDecimal
- transaction_type              String
- card_type                     String
- payment_method_type           String
- payment_reference             String
- channel_type                  String
- status                        String
- created_at                   DateTime
- updated_at                   DateTime

# 9. Transaction Status History

- id(pk)
- transaction_id                 Long
- old_status                     String
- new_status                     String
- changed_at                     DateTime



# Relationship

Customer (1) ____________ (M) Contract
Contract (1) ____________ (M) Merchant
Merchant (M) ____________ (1) Segment
Merchant  (1) ____________ (1) Bank Account



