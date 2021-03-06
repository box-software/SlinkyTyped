package typingsSlinky.atPulumiAws.wafregionalWebAclMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atPulumiAws.typesInputMod.wafregional.WebAclDefaultAction
import typingsSlinky.atPulumiAws.typesInputMod.wafregional.WebAclLoggingConfiguration
import typingsSlinky.atPulumiAws.typesInputMod.wafregional.WebAclRule
import typingsSlinky.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclArgs extends js.Object {
  /**
    * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: Input[WebAclDefaultAction] = js.native
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: js.UndefOr[Input[WebAclLoggingConfiguration]] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: Input[String] = js.native
  /**
    * The name or description of the web ACL.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Set of configuration blocks containing rules for the web ACL. Detailed below.
    */
  val rules: js.UndefOr[Input[js.Array[Input[WebAclRule]]]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object WebAclArgs {
  @scala.inline
  def apply(
    defaultAction: Input[WebAclDefaultAction],
    metricName: Input[String],
    loggingConfiguration: Input[WebAclLoggingConfiguration] = null,
    name: Input[String] = null,
    rules: Input[js.Array[Input[WebAclRule]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): WebAclArgs = {
    val __obj = js.Dynamic.literal(defaultAction = defaultAction.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    if (loggingConfiguration != null) __obj.updateDynamic("loggingConfiguration")(loggingConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclArgs]
  }
}

