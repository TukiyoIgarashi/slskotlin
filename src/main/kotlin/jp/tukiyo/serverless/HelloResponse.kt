package jp.tukiyo.serverless

data class HelloResponse(val message: String, val request: Request) : Response()
