package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ADM
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.APNS
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.APNS_SANDBOX
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.APNS_VOIP
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.APNS_VOIP_SANDBOX
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.BAIDU
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.CUSTOM
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.EMAIL
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.GCM
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.SMS
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointDemographicMod._UnmarshalledEndpointDemographic
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointLocationMod._UnmarshalledEndpointLocation
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointUserMod._UnmarshalledEndpointUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEndpointRequest extends _EndpointRequest {
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
    *
    * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
    */
  @JSName("Attributes")
  var Attributes__UnmarshalledEndpointRequest: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  /**
    * Demographic attributes for the endpoint.
    */
  @JSName("Demographic")
  var Demographic__UnmarshalledEndpointRequest: js.UndefOr[_UnmarshalledEndpointDemographic] = js.undefined
  /**
    * The endpoint location attributes.
    */
  @JSName("Location")
  var Location__UnmarshalledEndpointRequest: js.UndefOr[_UnmarshalledEndpointLocation] = js.undefined
  /**
    * Custom metrics that your app reports to Amazon Pinpoint.
    */
  @JSName("Metrics")
  var Metrics__UnmarshalledEndpointRequest: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  @JSName("User")
  var User__UnmarshalledEndpointRequest: js.UndefOr[_UnmarshalledEndpointUser] = js.undefined
}

object _UnmarshalledEndpointRequest {
  @scala.inline
  def apply(
    Address: String = null,
    Attributes: StringDictionary[js.Array[String]] = null,
    ChannelType: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String = null,
    Demographic: _UnmarshalledEndpointDemographic = null,
    EffectiveDate: String = null,
    EndpointStatus: String = null,
    Location: _UnmarshalledEndpointLocation = null,
    Metrics: StringDictionary[Double] = null,
    OptOut: String = null,
    RequestId: String = null,
    User: _UnmarshalledEndpointUser = null
  ): _UnmarshalledEndpointRequest = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic.asInstanceOf[js.Any])
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate.asInstanceOf[js.Any])
    if (EndpointStatus != null) __obj.updateDynamic("EndpointStatus")(EndpointStatus.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (OptOut != null) __obj.updateDynamic("OptOut")(OptOut.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledEndpointRequest]
  }
}

