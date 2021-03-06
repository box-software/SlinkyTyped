package typingsSlinky.slateDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slateDashReactMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.slate.slateMod.Controller

  type EditorProps[T /* <: Controller */] = BasicEditorProps[T] with Plugin[T]
  type EventHook[T] = js.Function3[/* event */ T, /* editor */ Editor, /* next */ js.Function0[js.Any], js.Any]
  type OnChangeFn = js.Function1[/* change */ OnChangeParam, js.Any]
  type RenderAttributes = StringDictionary[js.Any]
}
