import com.google.gson.annotations.SerializedName

data class InfoJogo(
    @SerializedName("info") val info: InfoApiShark
) {
    override fun toString(): String {
        return info.toString()
    }
}