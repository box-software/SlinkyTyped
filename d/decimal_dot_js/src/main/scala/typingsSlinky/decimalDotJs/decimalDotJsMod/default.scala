package typingsSlinky.decimalDotJs.decimalDotJsMod

import typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal.Config
import typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal.Constructor
import typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal.Modulo
import typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal.Rounding
import typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal.Value
import typingsSlinky.decimalDotJs.decimalDotJsNumbers.`0`
import typingsSlinky.decimalDotJs.decimalDotJsNumbers.`1`
import typingsSlinky.decimalDotJs.decimalDotJsNumbers.`2`
import typingsSlinky.decimalDotJs.decimalDotJsNumbers.`3`
import typingsSlinky.decimalDotJs.decimalDotJsNumbers.`4`
import typingsSlinky.decimalDotJs.decimalDotJsNumbers.`5`
import typingsSlinky.decimalDotJs.decimalDotJsNumbers.`6`
import typingsSlinky.decimalDotJs.decimalDotJsNumbers.`7`
import typingsSlinky.decimalDotJs.decimalDotJsNumbers.`8`
import typingsSlinky.decimalDotJs.decimalDotJsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decimal.js", JSImport.Default)
@js.native
class default protected () extends Decimal {
  def this(n: Value) = this()
}

/* static members */
@JSImport("decimal.js", JSImport.Default)
@js.native
object default extends js.Object {
  val Decimal: js.UndefOr[Constructor] = js.native
  val EUCLID: `9` = js.native
  val ROUND_CEIL: `2` = js.native
  val ROUND_DOWN: `1` = js.native
  val ROUND_FLOOR: `3` = js.native
  val ROUND_HALF_CEIL: `7` = js.native
  val ROUND_HALF_DOWN: `5` = js.native
  val ROUND_HALF_EVEN: `6` = js.native
  val ROUND_HALF_FLOOR: `8` = js.native
  val ROUND_HALF_UP: `4` = js.native
  val ROUND_UP: `0` = js.native
  val crypto: Boolean = js.native
  val default: js.UndefOr[Constructor] = js.native
  val maxE: Double = js.native
  val minE: Double = js.native
  val modulo: Modulo = js.native
  val precision: Double = js.native
  val rounding: Rounding = js.native
  val toExpNeg: Double = js.native
  val toExpPos: Double = js.native
  def abs(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def acos(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def acosh(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def add(x: Value, y: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def asin(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def asinh(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def atan(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def atan2(y: Value, x: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def atanh(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def cbrt(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def ceil(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def clone(`object`: Config): Constructor = js.native
  def config(`object`: Config): Constructor = js.native
  def cos(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def cosh(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def div(x: Value, y: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def exp(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def floor(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def hypot(n: Value*): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def isDecimal(`object`: js.Any): Boolean = js.native
  def ln(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def log(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def log(n: Value, base: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def log10(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def log2(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def max(n: Value*): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def min(n: Value*): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def mod(x: Value, y: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def mul(x: Value, y: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def noConflict(): Constructor = js.native
     // Browser only
  def pow(base: Value, exponent: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def random(): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def random(significantDigits: Double): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def round(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def set(`object`: Config): Constructor = js.native
  def sign(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def sin(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def sinh(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def sqrt(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def sub(x: Value, y: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def tan(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def tanh(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def trunc(n: Value): typingsSlinky.decimalDotJs.decimalDotJsMod.Decimal = js.native
}

