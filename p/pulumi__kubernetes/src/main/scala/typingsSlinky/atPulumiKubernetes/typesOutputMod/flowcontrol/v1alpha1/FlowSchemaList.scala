package typingsSlinky.atPulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

import typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.flowcontrolDotapiserverDotk8sDotioSlashv1alpha1
import typingsSlinky.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowSchemaList is a list of FlowSchema objects.
  */
trait FlowSchemaList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: flowcontrolDotapiserverDotk8sDotioSlashv1alpha1
  /**
    * `items` is a list of FlowSchemas.
    */
  val items: js.Array[FlowSchema]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.FlowSchemaList
  /**
    * `metadata` is the standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object FlowSchemaList {
  @scala.inline
  def apply(
    apiVersion: flowcontrolDotapiserverDotk8sDotioSlashv1alpha1,
    items: js.Array[FlowSchema],
    kind: typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.FlowSchemaList,
    metadata: ListMeta
  ): FlowSchemaList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlowSchemaList]
  }
}

