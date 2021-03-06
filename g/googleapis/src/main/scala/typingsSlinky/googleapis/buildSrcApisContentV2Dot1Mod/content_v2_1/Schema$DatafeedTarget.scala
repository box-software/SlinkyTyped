package typingsSlinky.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DatafeedTarget extends js.Object {
  /**
    * The country where the items in the feed will be included in the search
    * index, represented as a  CLDR territory code.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The list of destinations to exclude for this target (corresponds to
    * unchecked check boxes in Merchant Center).
    */
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of destinations to include for this target (corresponds to
    * checked check boxes in Merchant Center). Default destinations are always
    * included unless provided in the excluded_destination field.
    */
  var includedDestinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The two-letter ISO 639-1 language of the items in the feed. Must be a
    * valid language for targets[].country.
    */
  var language: js.UndefOr[String] = js.native
}

object Schema$DatafeedTarget {
  @scala.inline
  def apply(
    country: String = null,
    excludedDestinations: js.Array[String] = null,
    includedDestinations: js.Array[String] = null,
    language: String = null
  ): Schema$DatafeedTarget = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (excludedDestinations != null) __obj.updateDynamic("excludedDestinations")(excludedDestinations.asInstanceOf[js.Any])
    if (includedDestinations != null) __obj.updateDynamic("includedDestinations")(includedDestinations.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DatafeedTarget]
  }
}

