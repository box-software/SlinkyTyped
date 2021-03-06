package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDemographicsMod

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSetDimensionMod._SetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SegmentDemographics extends js.Object {
  /**
    * The app version criteria for the segment.
    */
  var AppVersion: js.UndefOr[_SetDimension] = js.undefined
  /**
    * The channel criteria for the segment.
    */
  var Channel: js.UndefOr[_SetDimension] = js.undefined
  /**
    * The device type criteria for the segment.
    */
  var DeviceType: js.UndefOr[_SetDimension] = js.undefined
  /**
    * The device make criteria for the segment.
    */
  var Make: js.UndefOr[_SetDimension] = js.undefined
  /**
    * The device model criteria for the segment.
    */
  var Model: js.UndefOr[_SetDimension] = js.undefined
  /**
    * The device platform criteria for the segment.
    */
  var Platform: js.UndefOr[_SetDimension] = js.undefined
}

object _SegmentDemographics {
  @scala.inline
  def apply(
    AppVersion: _SetDimension = null,
    Channel: _SetDimension = null,
    DeviceType: _SetDimension = null,
    Make: _SetDimension = null,
    Model: _SetDimension = null,
    Platform: _SetDimension = null
  ): _SegmentDemographics = {
    val __obj = js.Dynamic.literal()
    if (AppVersion != null) __obj.updateDynamic("AppVersion")(AppVersion.asInstanceOf[js.Any])
    if (Channel != null) __obj.updateDynamic("Channel")(Channel.asInstanceOf[js.Any])
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType.asInstanceOf[js.Any])
    if (Make != null) __obj.updateDynamic("Make")(Make.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SegmentDemographics]
  }
}

