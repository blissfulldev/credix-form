# Spring boot application to capture information about borrowers in credix
Tech Stack Used
### Java 17
### Spring Boot 3.0
### Maven
### MySql

# Running it locally
### Before running this locally please setup 
### Clone this repository 
### cd credix-form
### ./mvnw spring-boot:run

# Once application is running you can use postman collection to use different API
### POST [Create form definition](http://127.0.0.1:8080/api/forms/definitions)
Request payload
```
{
    "name": "Borrower form",
    "fields": [
        {
            "label": "What is the name of your company?",
            "dataType": "String"
        },
        {
            "label": "Where is your company located?",
            "dataType": "tuple (lat/lon)"
        },
        {
            "label": "How long does your company exist?",
            "dataType": "Integer"
        }
    ]
}
```
### POST [Submit form entry](http://127.0.0.1:8080/api/forms/form_id/entries)
Request payload
```
{"answers":[
    {
        "fieldId": 1,
        "answer": 8
    },
    {
        "fieldId": 2,
        "answer": 56
    },
    {
        "fieldId": 3,
        "answer": "(482, 2833)"
    }
]}
```
### GET [Get entries for borrower](http://127.0.0.1:8080/api/forms/form_id/entries)
Response payload
```
[
    {
        "formId": 4,
        "answerId": 1,
        "answers": [
            {
                "question": "What is the name of your company?",
                "answer": "a 55"
            },
            {
                "question": "How long does your company exist?",
                "answer": "6"
            },
            {
                "question": "Where is your company located?",
                "answer": "(2838, 2837)"
            }
        ]
    }
]
```
