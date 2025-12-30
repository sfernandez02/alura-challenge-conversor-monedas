import com.google.gson.annotations.SerializedName;

public record Moneda(double conversion_result,
                     String result,
                     @SerializedName("error-type")
                     String error_type) {
}
