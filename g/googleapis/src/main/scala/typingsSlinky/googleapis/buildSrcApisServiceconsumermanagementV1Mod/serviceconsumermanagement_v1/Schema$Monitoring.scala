package typingsSlinky.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Monitoring configuration of the service.  The example below shows how to
  * configure monitored resources and metrics for monitoring. In the example, a
  * monitored resource and two metrics are defined. The
  * `library.googleapis.com/book/returned_count` metric is sent to both
  * producer and consumer projects, whereas the
  * `library.googleapis.com/book/overdue_count` metric is only sent to the
  * consumer project.      monitored_resources:     - type:
  * library.googleapis.com/branch       labels:       - key: /city description:
  * The city where the library branch is located in.       - key: /name
  * description: The name of the branch.     metrics:     - name:
  * library.googleapis.com/book/returned_count       metric_kind: DELTA
  * value_type: INT64       labels:       - key: /customer_id     - name:
  * library.googleapis.com/book/overdue_count       metric_kind: GAUGE
  * value_type: INT64       labels:       - key: /customer_id     monitoring:
  * producer_destinations:       - monitored_resource:
  * library.googleapis.com/branch         metrics:         -
  * library.googleapis.com/book/returned_count       consumer_destinations: -
  * monitored_resource: library.googleapis.com/branch         metrics: -
  * library.googleapis.com/book/returned_count         -
  * library.googleapis.com/book/overdue_count
  */
@js.native
trait Schema$Monitoring extends js.Object {
  /**
    * Monitoring configurations for sending metrics to the consumer project.
    * There can be multiple consumer destinations. A monitored resouce type may
    * appear in multiple monitoring destinations if different aggregations are
    * needed for different sets of metrics associated with that monitored
    * resource type. A monitored resource and metric pair may only be used once
    * in the Monitoring configuration.
    */
  var consumerDestinations: js.UndefOr[js.Array[Schema$MonitoringDestination]] = js.native
  /**
    * Monitoring configurations for sending metrics to the producer project.
    * There can be multiple producer destinations. A monitored resouce type may
    * appear in multiple monitoring destinations if different aggregations are
    * needed for different sets of metrics associated with that monitored
    * resource type. A monitored resource and metric pair may only be used once
    * in the Monitoring configuration.
    */
  var producerDestinations: js.UndefOr[js.Array[Schema$MonitoringDestination]] = js.native
}

object Schema$Monitoring {
  @scala.inline
  def apply(
    consumerDestinations: js.Array[Schema$MonitoringDestination] = null,
    producerDestinations: js.Array[Schema$MonitoringDestination] = null
  ): Schema$Monitoring = {
    val __obj = js.Dynamic.literal()
    if (consumerDestinations != null) __obj.updateDynamic("consumerDestinations")(consumerDestinations.asInstanceOf[js.Any])
    if (producerDestinations != null) __obj.updateDynamic("producerDestinations")(producerDestinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Monitoring]
  }
}

