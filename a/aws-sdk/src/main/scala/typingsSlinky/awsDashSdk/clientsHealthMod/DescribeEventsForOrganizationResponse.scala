package typingsSlinky.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventsForOrganizationResponse extends js.Object {
  /**
    * The events that match the specified filter criteria.
    */
  var events: js.UndefOr[OrganizationEventList] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsHealthMod.nextToken] = js.native
}

object DescribeEventsForOrganizationResponse {
  @scala.inline
  def apply(events: OrganizationEventList = null, nextToken: nextToken = null): DescribeEventsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventsForOrganizationResponse]
  }
}

