package typingsSlinky.atPulumiKubernetes.typesOutputMod.storage.v1

import typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.storageDotk8sDotioSlashv1
import typingsSlinky.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StorageClassList is a collection of storage classes.
  */
trait StorageClassList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: storageDotk8sDotioSlashv1
  /**
    * Items is the list of StorageClasses
    */
  val items: js.Array[StorageClass]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.StorageClassList
  /**
    * Standard list metadata More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object StorageClassList {
  @scala.inline
  def apply(
    apiVersion: storageDotk8sDotioSlashv1,
    items: js.Array[StorageClass],
    kind: typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.StorageClassList,
    metadata: ListMeta
  ): StorageClassList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageClassList]
  }
}

