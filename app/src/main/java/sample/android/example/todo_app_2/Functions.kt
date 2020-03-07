package sample.android.example.todo_app_2
import android.content.Context
import android.widget.Toast

fun makeToast(context: Context, message: String){
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}