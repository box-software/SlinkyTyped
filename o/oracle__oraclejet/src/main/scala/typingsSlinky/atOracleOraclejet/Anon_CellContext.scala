package typingsSlinky.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atOracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellContext[K, D]
  extends /* propName */ StringDictionary[js.Any] {
  var cellContext: CellContext[K, D]
}

object Anon_CellContext {
  @scala.inline
  def apply[K, D](cellContext: CellContext[K, D], StringDictionary: /* propName */ StringDictionary[js.Any] = null): Anon_CellContext[K, D] = {
    val __obj = js.Dynamic.literal(cellContext = cellContext.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CellContext[K, D]]
  }
}

