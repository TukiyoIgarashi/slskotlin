package jp.tukiyo.serverless

import org.apache.logging.log4j.LogManager
import java.io.Serializable

@Suppress("UNCHECKED_CAST")
class Request(input: Map<String, Any>): Serializable {

    private val LOG = LogManager.getLogger(Request::class.java)
    val resource: String
    val path: String
    val httpMethod: String
    val headers: Map<String, String>
    val queries: Map<String, String>
    val pathParameters: Map<String, String>
    val stageVariables: Map<String, String>
    val requestContext: Map<String, Any>
    val body: Map<String, Any>
    val isBase64Encoded: Boolean

    init {
        try {
            resource = input["resource"] as String
            path = input["path"] as String
            httpMethod = input["httpMethod"] as String
            headers = (input["headers"] as? Map<String, String>) ?: emptyMap()
            queries = (input["queryStringParameters"] as? Map<String, String>) ?: emptyMap()
            pathParameters = (input["pathParameters"] as? Map<String, String>) ?: emptyMap()
            stageVariables = (input["stageVariables"] as? Map<String, String>) ?: emptyMap()
            requestContext = (input["requestContext"] as? Map<String, Any>) ?: emptyMap()
            body = (input["body"] as? Map<String, Any>) ?: emptyMap()
            isBase64Encoded = (input["isBase64Encoded"] as? Boolean) ?: false
        } catch (e: Exception) {
            LOG.error("failed to serialize object", e)
            throw RuntimeException(e)
        }
    }
}