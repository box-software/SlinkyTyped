package typingsSlinky.atPulumiKubernetes.typesInputMod.apps.v1beta1

import typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.appsSlashv1beta1
import typingsSlinky.atPulumiKubernetes.typesInputMod.meta.v1.ListMeta
import typingsSlinky.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentList is a list of Deployments.
  */
trait DeploymentList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[appsSlashv1beta1]] = js.undefined
  /**
    * Items is the list of Deployments.
    */
  var items: Input[js.Array[Input[Deployment]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.DeploymentList]] = js.undefined
  /**
    * Standard list metadata.
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object DeploymentList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[Deployment]]],
    apiVersion: Input[appsSlashv1beta1] = null,
    kind: Input[typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.DeploymentList] = null,
    metadata: Input[ListMeta] = null
  ): DeploymentList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentList]
  }
}

