package typingsSlinky.atPulumiKubernetes.typesOutputMod.apps.v1

import typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.appsSlashv1
import typingsSlinky.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatefulSetList is a collection of StatefulSets.
  */
trait StatefulSetList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: appsSlashv1
  val items: js.Array[StatefulSet]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSetList
  val metadata: ListMeta
}

object StatefulSetList {
  @scala.inline
  def apply(
    apiVersion: appsSlashv1,
    items: js.Array[StatefulSet],
    kind: typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSetList,
    metadata: ListMeta
  ): StatefulSetList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatefulSetList]
  }
}

