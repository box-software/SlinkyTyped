package typingsSlinky.baseui.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.paymentDashCardMod.StatefulPaymentCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(baseui), Name(paymentDashCardMod), Name(StatefulPaymentCardProps))) was not a @ScalaJSDefined trait */
object StatefulPaymentCard
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/payment-card", "StatefulPaymentCard")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StatefulPaymentCardProps
}

