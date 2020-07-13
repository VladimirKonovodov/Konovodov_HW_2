package model

class Profile(
    val id: Int,
    val login: String,
    val name: String,
    val surname: String,
    val status: String,
    val avatar: String/*BitMap*/
) {
    val fullname: String
        get() = "к доске пойдет $name $surname"

}