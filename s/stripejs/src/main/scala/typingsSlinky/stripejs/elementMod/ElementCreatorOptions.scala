package typingsSlinky.stripejs.elementMod

import typingsSlinky.stripejs.stripejsStrings.auto
import typingsSlinky.stripejs.stripejsStrings.da
import typingsSlinky.stripejs.stripejsStrings.de
import typingsSlinky.stripejs.stripejsStrings.en
import typingsSlinky.stripejs.stripejsStrings.es
import typingsSlinky.stripejs.stripejsStrings.fi
import typingsSlinky.stripejs.stripejsStrings.fr
import typingsSlinky.stripejs.stripejsStrings.it
import typingsSlinky.stripejs.stripejsStrings.ja
import typingsSlinky.stripejs.stripejsStrings.nl
import typingsSlinky.stripejs.stripejsStrings.no
import typingsSlinky.stripejs.stripejsStrings.sv
import typingsSlinky.stripejs.stripejsStrings.zh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCreatorOptions extends js.Object {
  /**
    * Fonts that should be used for styling the element
    * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
    */
  var fonts: js.UndefOr[js.Array[FontCSSElement | FontConfigElement]] = js.undefined
  /**
    * The translation that should be used for the element text
    * `auto` defaults to the browser language
    *
    * @default 'auto'
    */
  var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String] = js.undefined
}

object ElementCreatorOptions {
  @scala.inline
  def apply(
    fonts: js.Array[FontCSSElement | FontConfigElement] = null,
    locale: auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String = null
  ): ElementCreatorOptions = {
    val __obj = js.Dynamic.literal()
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCreatorOptions]
  }
}

