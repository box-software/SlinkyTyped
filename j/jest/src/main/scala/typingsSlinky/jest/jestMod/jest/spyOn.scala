package typingsSlinky.jest.jestMod.jest

import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.spyOn")
@js.native
object spyOn extends js.Object {
  def apply[T /* <: js.Object */, M /* <: FunctionPropertyNames[Required[T]] */](`object`: T, method: M): SpyInstance[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = js.native
}

