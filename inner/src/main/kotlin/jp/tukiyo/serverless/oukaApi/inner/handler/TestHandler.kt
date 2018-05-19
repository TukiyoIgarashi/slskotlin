package jp.tukiyo.serverless.oukaApi.inner.handler

import jp.tukiyo.serverless.oukaApi.core.ApiGatewayResponse
import jp.tukiyo.serverless.oukaApi.core.BaseHandler
import jp.tukiyo.serverless.oukaApi.core.Request
import jp.tukiyo.serverless.oukaApi.inner.response.HelloResponse

class TestHandler : BaseHandler() {

    override fun handleRequest(request: Request): ApiGatewayResponse {

        return ApiGatewayResponse.build {
            statusCode = 200
            objectBody = HelloResponse("Go Serverless v1.x! Your Kotlin function executed successfully!", request)
            headers = mapOf("X-Powered-By" to "AWS Lambda & serverless")
        }
    }
}
