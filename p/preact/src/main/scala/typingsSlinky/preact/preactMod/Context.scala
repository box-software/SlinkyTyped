package typingsSlinky.preact.preactMod

import typingsSlinky.preact.Anon_ChildrenValue
import typingsSlinky.preact.Anon_ChildrenValueComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[T] extends js.Object {
  @JSName("Consumer")
  var Consumer_Original: Consumer[T] = js.native
  @JSName("Provider")
  var Provider_Original: Provider[T] = js.native
  def Consumer(props: RenderableProps[Anon_ChildrenValue[T], _]): VNode[_] | Null = js.native
  def Consumer(props: RenderableProps[Anon_ChildrenValue[T], _], context: js.Any): VNode[_] | Null = js.native
  def Provider(props: RenderableProps[Anon_ChildrenValueComponentChildren[T], _]): VNode[_] | Null = js.native
  def Provider(props: RenderableProps[Anon_ChildrenValueComponentChildren[T], _], context: js.Any): VNode[_] | Null = js.native
}

