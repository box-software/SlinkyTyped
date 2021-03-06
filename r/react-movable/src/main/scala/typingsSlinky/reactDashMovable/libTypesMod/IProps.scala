package typingsSlinky.reactDashMovable.libTypesMod

import slinky.core.TagMod
import typingsSlinky.reactDashMovable.Anon_Children
import typingsSlinky.reactDashMovable.Anon_Elements
import typingsSlinky.reactDashMovable.Anon_Index
import typingsSlinky.reactDashMovable.Anon_NewIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps[Value] extends js.Object {
  var beforeDrag: js.UndefOr[js.Function1[/* params */ Anon_Elements, Unit]] = js.undefined
  var lockVertically: Boolean
  var removableByMove: Boolean
  var transitionDuration: Double
  var values: js.Array[Value]
  var voiceover: IVoiceover
  def onChange(meta: Anon_NewIndex): Unit
  def renderItem(params: Anon_Index[Value]): TagMod[Any]
  def renderList(props: Anon_Children): TagMod[Any]
}

object IProps {
  @scala.inline
  def apply[Value](
    lockVertically: Boolean,
    onChange: Anon_NewIndex => Unit,
    removableByMove: Boolean,
    renderItem: Anon_Index[Value] => TagMod[Any],
    renderList: Anon_Children => TagMod[Any],
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover,
    beforeDrag: /* params */ Anon_Elements => Unit = null
  ): IProps[Value] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    if (beforeDrag != null) __obj.updateDynamic("beforeDrag")(js.Any.fromFunction1(beforeDrag))
    __obj.asInstanceOf[IProps[Value]]
  }
}

