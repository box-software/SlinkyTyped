package typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreEnhancedMetricsMod

import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ALL
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.IncomingBytes
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.IncomingRecords
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.IteratorAgeMilliseconds
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.OutgoingBytes
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.OutgoingRecords
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ReadProvisionedThroughputExceeded
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.WriteProvisionedThroughputExceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EnhancedMetrics extends js.Object {
  /**
    * <p>List of shard-level metrics.</p> <p>The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.</p> <ul> <li> <p> <code>IncomingBytes</code> </p> </li> <li> <p> <code>IncomingRecords</code> </p> </li> <li> <p> <code>OutgoingBytes</code> </p> </li> <li> <p> <code>OutgoingRecords</code> </p> </li> <li> <p> <code>WriteProvisionedThroughputExceeded</code> </p> </li> <li> <p> <code>ReadProvisionedThroughputExceeded</code> </p> </li> <li> <p> <code>IteratorAgeMilliseconds</code> </p> </li> <li> <p> <code>ALL</code> </p> </li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.</p>
    */
  var ShardLevelMetrics: js.UndefOr[
    (js.Array[
      IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
    ]) | (js.Iterable[
      IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
    ])
  ] = js.undefined
}

object _EnhancedMetrics {
  @scala.inline
  def apply(
    ShardLevelMetrics: (js.Array[
      IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
    ]) | (js.Iterable[
      IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
    ]) = null
  ): _EnhancedMetrics = {
    val __obj = js.Dynamic.literal()
    if (ShardLevelMetrics != null) __obj.updateDynamic("ShardLevelMetrics")(ShardLevelMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EnhancedMetrics]
  }
}

