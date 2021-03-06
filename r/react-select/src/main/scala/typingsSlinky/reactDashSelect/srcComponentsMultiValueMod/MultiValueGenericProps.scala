package typingsSlinky.reactDashSelect.srcComponentsMultiValueMod

import slinky.core.TagMod
import typingsSlinky.reactDashSelect.Anon_ClassName
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiValueGenericProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var children: TagMod[Any]
  var data: OptionType
  var innerProps: Anon_ClassName
  var selectProps: js.Any
}

object MultiValueGenericProps {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](children: TagMod[Any], data: OptionType, innerProps: Anon_ClassName, selectProps: js.Any): MultiValueGenericProps[OptionType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
  }
}

