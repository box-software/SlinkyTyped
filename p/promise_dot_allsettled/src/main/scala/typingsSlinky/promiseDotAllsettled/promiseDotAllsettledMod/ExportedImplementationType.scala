package typingsSlinky.promiseDotAllsettled.promiseDotAllsettledMod

import typingsSlinky.promiseDotAllsettled.Fn_Iterable
import typingsSlinky.promiseDotAllsettled.implementationMod.PromiseTuple
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedImplementationType extends js.Object {
  @JSName("getPolyfill")
  var getPolyfill_Original: js.Function0[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
  ] = js.native
  @JSName("implementation")
  var implementation_Original: Fn_Iterable = js.native
  @JSName("shim")
  var shim_Original: js.Function0[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
  ] = js.native
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: js.Array[_] */](iterable: PromiseTuple[T]): js.Promise[typingsSlinky.promiseDotAllsettled.implementationMod.PromiseResultTuple[T]] = js.native
  def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[typingsSlinky.promiseDotAllsettled.typesMod.PromiseResult[T, _]]] = js.native
  def getPolyfill(): /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any = js.native
  def implementation(): js.Promise[js.Array[js.Any]] = js.native
  def implementation[T /* <: js.Array[_] */](iterable: PromiseTuple[T]): js.Promise[typingsSlinky.promiseDotAllsettled.implementationMod.PromiseResultTuple[T]] = js.native
  def implementation[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[typingsSlinky.promiseDotAllsettled.typesMod.PromiseResult[T, _]]] = js.native
  def shim(): /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any = js.native
}

