# Springboot
Пока что реализована только локальна бд и 2 запроса.
1. POST /save/passport
2. GET /passport
## Тело запроса для теста
```
{
    "name":"Odin",
    "blocks":[
        {
            "header":"someHeader1",
            "fields":[
                {
                    "type":"sometype1",
                    "name":"somename1",
                    "unit":"someunit1",
                    "fixedValues":[
                        "somevalue1", "somevalue2"
                    ],
                    "fileBtns":[
                        "somedescr1", "somedescr2" 
                    ]
                },
                {
                    "type":"sometype2",
                    "name":"somename2",
                    "unit":"someunit2",
                    "fixedValues":[
                        "somevalue3", "somevalue4"
                    ],
                    "fileBtns":[
                        "somedescr3", "somedescr4" 
                    ]
                }
            ]
        },
        {
            "header":"someHeader2",
            "fields":[
                {
                    "type":"sometype3",
                    "name":"somename3",
                    "unit":"someunit3",
                    "fixedValues":[
                        "somevalue5", "somevalue6"
                    ],
                    "fileBtns":[
                        "somedescr5", "somedescr6" 
                    ]
                }
            ]
        }
    ]
}
```
