package typingsSlinky.atPulumiKubernetes.apiextensionsCustomResourceMod

import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.Alias
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.CustomTimeouts
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import typingsSlinky.atPulumiPulumi.resourceMod.ProviderResource
import typingsSlinky.atPulumiPulumi.resourceMod.Resource
import typingsSlinky.atPulumiPulumi.resourceMod.ResourceTransformation
import typingsSlinky.atPulumiPulumi.resourceMod.URN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomResourceGetOptions extends CustomResourceOptions {
  /**
    * apiVersion is the API version of the apiExtensions.CustomResource we wish to select,
    * as specified by the CustomResourceDefinition that defines it on the API server.
    */
  var apiVersion: Input[String]
  /**
    * An ID for the Kubernetes resource to retrieve. Takes the form [namespace]/[name] or
    * [name].
    */
  @JSName("id")
  var id_CustomResourceGetOptions: Input[ID]
  /**
    * kind is the kind of the apiextensions.CustomResource we wish to select, as specified by
    * the CustomResourceDefinition that defines it on the API server.
    */
  var kind: Input[String]
}

object CustomResourceGetOptions {
  @scala.inline
  def apply(
    apiVersion: Input[String],
    id: Input[ID],
    kind: Input[String],
    additionalSecretOutputs: js.Array[String] = null,
    aliases: js.Array[Input[URN | Alias]] = null,
    customTimeouts: CustomTimeouts = null,
    deleteBeforeReplace: js.UndefOr[Boolean] = js.undefined,
    dependsOn: Input[js.Array[Input[Resource]] | Resource] = null,
    ignoreChanges: js.Array[String] = null,
    `import`: ID = null,
    parent: Resource = null,
    protect: js.UndefOr[Boolean] = js.undefined,
    provider: ProviderResource = null,
    transformations: js.Array[ResourceTransformation] = null,
    version: String = null
  ): CustomResourceGetOptions = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (additionalSecretOutputs != null) __obj.updateDynamic("additionalSecretOutputs")(additionalSecretOutputs.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (customTimeouts != null) __obj.updateDynamic("customTimeouts")(customTimeouts.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteBeforeReplace)) __obj.updateDynamic("deleteBeforeReplace")(deleteBeforeReplace.asInstanceOf[js.Any])
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (ignoreChanges != null) __obj.updateDynamic("ignoreChanges")(ignoreChanges.asInstanceOf[js.Any])
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (transformations != null) __obj.updateDynamic("transformations")(transformations.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceGetOptions]
  }
}

