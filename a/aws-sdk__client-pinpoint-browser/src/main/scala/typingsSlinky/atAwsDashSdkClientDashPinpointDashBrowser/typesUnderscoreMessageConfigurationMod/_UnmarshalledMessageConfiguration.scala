package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageConfigurationMod

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignEmailMessageMod._UnmarshalledCampaignEmailMessage
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignSmsMessageMod._UnmarshalledCampaignSmsMessage
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageMod._UnmarshalledMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledMessageConfiguration extends _MessageConfiguration {
  /**
    * The message that the campaign delivers to ADM channels. Overrides the default message.
    */
  @JSName("ADMMessage")
  var ADMMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledMessage] = js.undefined
  /**
    * The message that the campaign delivers to APNS channels. Overrides the default message.
    */
  @JSName("APNSMessage")
  var APNSMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledMessage] = js.undefined
  /**
    * The message that the campaign delivers to Baidu channels. Overrides the default message.
    */
  @JSName("BaiduMessage")
  var BaiduMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledMessage] = js.undefined
  /**
    * The default message for all channels.
    */
  @JSName("DefaultMessage")
  var DefaultMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledMessage] = js.undefined
  /**
    * The email message configuration.
    */
  @JSName("EmailMessage")
  var EmailMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledCampaignEmailMessage] = js.undefined
  /**
    * The message that the campaign delivers to GCM channels. Overrides the default message.
    */
  @JSName("GCMMessage")
  var GCMMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledMessage] = js.undefined
  /**
    * The SMS message configuration.
    */
  @JSName("SMSMessage")
  var SMSMessage__UnmarshalledMessageConfiguration: js.UndefOr[_UnmarshalledCampaignSmsMessage] = js.undefined
}

object _UnmarshalledMessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: _UnmarshalledMessage = null,
    APNSMessage: _UnmarshalledMessage = null,
    BaiduMessage: _UnmarshalledMessage = null,
    DefaultMessage: _UnmarshalledMessage = null,
    EmailMessage: _UnmarshalledCampaignEmailMessage = null,
    GCMMessage: _UnmarshalledMessage = null,
    SMSMessage: _UnmarshalledCampaignSmsMessage = null
  ): _UnmarshalledMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage.asInstanceOf[js.Any])
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage.asInstanceOf[js.Any])
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage.asInstanceOf[js.Any])
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage.asInstanceOf[js.Any])
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage.asInstanceOf[js.Any])
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledMessageConfiguration]
  }
}

