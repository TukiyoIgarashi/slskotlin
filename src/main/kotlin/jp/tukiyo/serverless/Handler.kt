package jp.tukiyo.serverless

class Handler : BaseHandler() {

    override fun handleRequest(request: Request): ApiGatewayResponse {
        return ApiGatewayResponse.build {
            statusCode = 200
            objectBody = HelloResponse("Go Serverless v1.x! Your Kotlin function executed successfully!", request)
            headers = mapOf("X-Powered-By" to "AWS Lambda & serverless")
        }
    }
}
