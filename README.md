# Let Large Language Models understand your API
Large Language Models(LLMs) combined with private domain data bring huge value. There are currently many methods around how to make LLMs use private domain data more effectively. RAG's research allows LLMs to response user queris or generate reports through private domain data. These private domain data include text, databases, knowledge graphs, etc. However, these data need to be collected and organized for RAG. For situations where there is a large amount of complicated data, how RAG can provide support for LLMs more effectively is an important topic. 

Many systems provide various APIs, and some APIs can add, obtain, update or delete data(CRUD) in the service based on parameters. Some APIs can accomplish certain tasks. If the LLMs can understand the business functions and parameters of the API by themeselves, LLMs can be combined with the API to complete user queries. Swagger is a very popular library that helps developers generate API documentation and a visualization API teat tools. This project uses the large model to read the Swagger document to understand the business and parameters of the API, and automatically execute the user's query based on the understanding. It helps LLMs  implement API-based RAG. API-based Agent.

![image](https://github.com/onestepai/api_rag/assets/107015943/efa56206-6628-4587-8290-7e85e5e625db)

## api_rag_demo
This a demo service for called by api_rag service. Please find detail info in project 

https://github.com/onestepai/api_rag

