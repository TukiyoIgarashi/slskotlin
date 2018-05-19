package jp.tukiyo.serverless.oukaApi.core.repository.dynamo

import com.amazonaws.regions.Regions
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper

abstract class BaseRepository<I> {

    private val client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_WEST_2).build()
    private val mapper = DynamoDBMapper(client)

    fun save(item: I) {
        mapper.save(item)

    }
}
