package typingsSlinky.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  /** Amount in the currency listed below. (In LITE projection.) */
  var amount: js.UndefOr[Double] = js.undefined
  /** An ISO 4217, three-letter currency code. (In LITE projection.) */
  var currencyCode: js.UndefOr[String] = js.undefined
}

object Anon_Amount {
  @scala.inline
  def apply(amount: Int | Double = null, currencyCode: String = null): Anon_Amount = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Amount]
  }
}

