package jp.tukiyo.serverless.oukaApi.inner.response

import jp.tukiyo.serverless.oukaApi.core.Request
import jp.tukiyo.serverless.oukaApi.core.Response

data class HelloResponse(val message: String, val request: Request) : Response()
