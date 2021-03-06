package typingsSlinky.dynogels.dynogelsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsDashSdk.clientsDynamodbMod.AttributeUpdates
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ConditionExpression
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ConditionalOperator
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ExpectedAttributeMap
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ExpressionAttributeNameMap
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ReturnConsumedCapacity
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ReturnItemCollectionMetrics
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ReturnValue
import typingsSlinky.awsDashSdk.clientsDynamodbMod.UpdateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateItemOptions extends js.Object {
  var AttributeUpdates: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.AttributeUpdates] = js.undefined
  var ConditionExpression: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.ConditionExpression] = js.undefined
  var ConditionalOperator: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.ConditionalOperator] = js.undefined
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
  var ReturnItemCollectionMetrics: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.ReturnItemCollectionMetrics] = js.undefined
  var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
  var UpdateExpression: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.UpdateExpression] = js.undefined
  var expected: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object UpdateItemOptions {
  @scala.inline
  def apply(
    AttributeUpdates: AttributeUpdates = null,
    ConditionExpression: ConditionExpression = null,
    ConditionalOperator: ConditionalOperator = null,
    Expected: ExpectedAttributeMap = null,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: StringDictionary[js.Any] = null,
    ReturnConsumedCapacity: ReturnConsumedCapacity = null,
    ReturnItemCollectionMetrics: ReturnItemCollectionMetrics = null,
    ReturnValues: ReturnValue = null,
    UpdateExpression: UpdateExpression = null,
    expected: StringDictionary[js.Any] = null
  ): UpdateItemOptions = {
    val __obj = js.Dynamic.literal()
    if (AttributeUpdates != null) __obj.updateDynamic("AttributeUpdates")(AttributeUpdates.asInstanceOf[js.Any])
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression.asInstanceOf[js.Any])
    if (ConditionalOperator != null) __obj.updateDynamic("ConditionalOperator")(ConditionalOperator.asInstanceOf[js.Any])
    if (Expected != null) __obj.updateDynamic("Expected")(Expected.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues.asInstanceOf[js.Any])
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    if (ReturnItemCollectionMetrics != null) __obj.updateDynamic("ReturnItemCollectionMetrics")(ReturnItemCollectionMetrics.asInstanceOf[js.Any])
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues.asInstanceOf[js.Any])
    if (UpdateExpression != null) __obj.updateDynamic("UpdateExpression")(UpdateExpression.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateItemOptions]
  }
}

