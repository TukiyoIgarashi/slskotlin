package jp.tukiyo.serverless

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import org.apache.logging.log4j.LogManager

abstract class BaseHandler : RequestHandler<Map<String, Any>, ApiGatewayResponse> {

    companion object {
        val LOG = LogManager.getLogger(this::class.java)
    }

    abstract fun handleRequest(request: Request): ApiGatewayResponse

    override fun handleRequest(input: Map<String, Any>, context: Context?): ApiGatewayResponse {
        return handleRequest(Request(input))
    }
}
