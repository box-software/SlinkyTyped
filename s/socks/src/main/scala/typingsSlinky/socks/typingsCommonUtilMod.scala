package typingsSlinky.socks

import typingsSlinky.socks.typingsCommonConstantsMod.SocksClientChainOptions
import typingsSlinky.socks.typingsCommonConstantsMod.SocksClientOptions
import typingsSlinky.std.Error
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socks/typings/common/util", JSImport.Namespace)
@js.native
object typingsCommonUtilMod extends js.Object {
  /**
    * Error wrapper for SocksClient
    */
  @js.native
  class SocksClientError protected () extends Error {
    def this(message: String, options: SocksClientChainOptions) = this()
    def this(message: String, options: SocksClientOptions) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var options: SocksClientOptions | SocksClientChainOptions = js.native
  }
  
  /**
    * Shuffles a given array.
    * @param array The array to shuffle.
    */
  def shuffleArray(array: js.Array[_]): Unit = js.native
  type RequireOnlyOne[T, Keys /* <: String */] = (Pick[T, Exclude[String, Keys]]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]:? std.Required<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
}

