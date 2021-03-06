package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentLocationMod

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGPSPointDimensionMod._GPSPointDimension
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSetDimensionMod._SetDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SegmentLocation extends js.Object {
  /**
    * The country or region, in ISO 3166-1 alpha-2 format.
    */
  var Country: js.UndefOr[_SetDimension] = js.undefined
  /**
    * The GPS Point dimension.
    */
  var GPSPoint: js.UndefOr[_GPSPointDimension] = js.undefined
}

object _SegmentLocation {
  @scala.inline
  def apply(Country: _SetDimension = null, GPSPoint: _GPSPointDimension = null): _SegmentLocation = {
    val __obj = js.Dynamic.literal()
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (GPSPoint != null) __obj.updateDynamic("GPSPoint")(GPSPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SegmentLocation]
  }
}

