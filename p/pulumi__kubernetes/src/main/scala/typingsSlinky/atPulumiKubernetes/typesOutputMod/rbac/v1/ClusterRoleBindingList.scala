package typingsSlinky.atPulumiKubernetes.typesOutputMod.rbac.v1

import typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1
import typingsSlinky.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRoleBindingList is a collection of ClusterRoleBindings
  */
trait ClusterRoleBindingList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: rbacDotauthorizationDotk8sDotioSlashv1
  /**
    * Items is a list of ClusterRoleBindings
    */
  val items: js.Array[ClusterRoleBinding]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBindingList
  /**
    * Standard object's metadata.
    */
  val metadata: ListMeta
}

object ClusterRoleBindingList {
  @scala.inline
  def apply(
    apiVersion: rbacDotauthorizationDotk8sDotioSlashv1,
    items: js.Array[ClusterRoleBinding],
    kind: typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBindingList,
    metadata: ListMeta
  ): ClusterRoleBindingList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterRoleBindingList]
  }
}

