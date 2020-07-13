package vk.hierchy

class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val friendsOnly: Int,
    val comments: Comments? = null,
    val copyright: String,
    val likes: Likes? = null,
    val views: Views,
    val postType: String,
    val postSource: PostSource,
    //val attachments: Array<>
    val geo: Geo? = null,
    val signerId: Int,
    //val copyHistory: Array<>
    val canPin: Int,
    val canDelete: Int,
    val canEdit: Int,
    val isPinned: Int,
    val markedAsAds: Int,
    val isFavorite: Boolean,
    val postponedId: Int
) {


}