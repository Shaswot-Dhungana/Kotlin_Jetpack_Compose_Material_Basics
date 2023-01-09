package com.shaswotdhungana.materialcompose

import android.graphics.drawable.Icon
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.shaswotdhungana.materialcompose.ui.theme.MaterialComposeTheme
import androidx.compose.material3.Icon as Icon1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .verticalScroll(
                    rememberScrollState()
                )) {
//                MyFun()
//                MyFun2(name = "I am Vengeance !!!")
//                MyFun3()
//                MyFun4()
//                MyFun5()
//                MyFun6()
//                MyFun7()
//                MyFun8()



            }

//                MyFun9()
//              MyFun10()
//            MyFun11()
//            MyFun12()


//            MaterialUiApp()
//            imageOnSCreen()

//            NetworkImgOnScreen()

//            iconExample()

//            ButtonsExample()
//            textFieldExample()

        }
    }
}

// Composable.

@Composable
fun MyFun(){
    Text(text = "MR.Bruce Wayne", fontSize = 30.sp)
}


@Composable
fun MyFun2(name:String){
    Text(text = name, fontSize = 30.sp)
}

@Composable
fun MyFun3(){
   val names = listOf<String>("Gotham" , "BatMobile" , "BatMan")
    for (name in names){
        Text(
            text = name ,
            fontSize = 35.sp ,
            color = Color.Red
        );
    }
}

@Composable
fun MyFun4(){
    Text(
        text = "Vengeance" ,
        fontSize = 30.sp ,
        color = Color.Magenta ,
        fontStyle = FontStyle.Italic ,
        fontWeight = FontWeight.ExtraBold ,
        textAlign = TextAlign.Center ,
        modifier = Modifier
            .background(Color.Yellow)
            .width(410.dp)
        )
}

@Composable
fun MyFun5(){
    Text(text = "I Am BatMan." ,
        fontSize = 30.sp ,
        color = Color.Yellow ,
        fontStyle = FontStyle.Italic ,
        fontWeight = FontWeight.ExtraBold ,
        textAlign = TextAlign.Center ,
        modifier = Modifier
            .background(Color.Black)
            .width(410.dp)
        )
}

@Composable
fun MyFun6(){
    Text(text = " Selena Kyle  ".repeat(10) ,
        maxLines = 5 ,
        fontSize = 30.sp ,
        color = Color.DarkGray ,
        fontStyle = FontStyle.Italic ,
        fontWeight = FontWeight.ExtraBold ,
        textAlign = TextAlign.Center ,
        modifier = Modifier
            .background(Color.Magenta)
            .width(410.dp)
    )
}

// selectable text.
@Composable
fun MyFun7(){
    Text(text = "Copy Below Text :~ ",
        fontSize = 30.sp,
        color = Color.Cyan,
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.Center ,
        modifier = Modifier
            .background(Color.DarkGray)
            .width(410.dp)
    )


    // selectable text.
   SelectionContainer() {

       Text(text = "Mr.Bruce Wayne" ,
           fontSize = 30.sp,
           color = Color.Cyan,
           fontWeight = FontWeight.ExtraBold,
           textAlign = TextAlign.Center ,
           modifier = Modifier
               .background(Color.DarkGray)
               .width(410.dp)
       )


   }
}


// Row
@Composable
fun MyFun8(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Color.Transparent) ,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
        ) {
        Text(text = " i " , fontSize = 30.sp)
        Text(text = " am ", fontSize = 30.sp)
        Text(text = " a ", fontSize = 30.sp)
        Text(text = " Row ", fontSize = 30.sp)
    }
}


// LazyRow
@Composable
fun MyFun9(){
    LazyRow(
        modifier = Modifier.background(Color.LightGray) ,
        horizontalArrangement = Arrangement.spacedBy(50.dp)
    ){

        // Single items
        item { Text(text = "First Item ", fontSize = 25.sp) }

        // Multiple items.
        items (15) { i ->  Text(text = " item $i" , fontSize = 25.sp) }

        // Single items
        item { Text(text = " Last Item ", fontSize = 25.sp) }
    }
}


// Lazy Column

@Composable
fun MyFun10(){
    LazyColumn(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth() ,
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.spacedBy(50.dp)

    ){

        // Single items
        item { Text(text = "First Item ", fontSize = 25.sp) }

        // Multiple items.
        items (5) { i ->  Text(text = " item $i" , fontSize = 25.sp) }

        // Single items
        item { Text(text = " Last Item ", fontSize = 25.sp) }
    }
}



// Box
@Composable
fun MyFun11(){
    Box(
modifier = Modifier
    .background(Color.Green)
    .fillMaxWidth(0.5f)
    .fillMaxHeight(0.5f) ,


    ){
        Text(text = "This is a box." , fontSize = 30.sp)
    }
}



// Box inside box
@Composable
fun MyFun12(){
    Box(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.5f)


        ){
        Text(text = "             1" , fontSize = 30.sp ,   color = Color.Black , fontWeight = FontWeight.ExtraBold)

        // Box inside box.
        Box(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
        ){
            Text(text = " 2" , fontSize = 30.sp , color = Color.Black , fontWeight = FontWeight.ExtraBold)
        }
    }
}



@Composable
fun imageOnSCreen(){

    Image(painter = painterResource(id = R.drawable.myimg),
        contentDescription = "My Image" ,
        modifier = Modifier.border(5.5.dp, Color.Red)

    )

}

@Composable
fun NetworkImgOnScreen(){
    Image(painter = rememberImagePainter(data = "https://images5.alphacoders.com/532/532559.jpg"),
        contentDescription = "Network Image" ,
        modifier = Modifier.border(5.5.dp, Color.Red)
    )
}

@Composable
fun iconExample(){

    Icon1(
        Icons.Filled.Menu,
        contentDescription = "Menu Icon" ,
        modifier = Modifier.size(70.dp),
        tint = Color.Green
    )

}



// var = variable , values can be changed
// val = constant. value doesnt changed



@Composable
fun ButtonsExample(){
    Column() {
      // Normal button
        Button(
            onClick = { Log.d("Button", "Button Clicked")} ,
            modifier = Modifier.padding(35.dp) ,
            contentPadding = PaddingValues(start = 40.dp , top = 20.dp , end = 40.dp , bottom = 20.dp) ,
//          colors = ButtonDefaults.buttonColors(Color.Red) ,
//          shape = CircleShape ,
//            border = BorderStroke(1.dp , Color.Red)
        ) {
            Text(text = "Button 1" , fontSize = 20.sp)
        }

        // Text Button

        TextButton(
            onClick = {  Log.d("TextButton", "Button Clicked") } ,
            modifier = Modifier.padding(35.dp) ,
//                      colors = ButtonDefaults.outlinedButtonColors(Color.Red) ,

        ) {

            Text(text = "Text Button"  , fontSize = 20.sp)

        }


        // Outlined Button.

        OutlinedButton(
            onClick = {  Log.d("OutlinedButton", "Button Clicked") } ,
            modifier = Modifier.padding(35.dp) ,
//                      colors = ButtonDefaults.outlinedButtonColors(Color.Red) ,

        ) {

            Text(text = "Text Button"  , fontSize = 20.sp)

        }


        // Icon Button

//        IconButton(
//            onClick = {  Log.d("IconButton", "Button Clicked") } ,
//            modifier = Modifier.padding(35.dp) ,
//        ) {
//
//            Icon(Icons.Default.Add )
//
//        }
//

        // Floating Action Button
//
//        FloatingActionButton(onClick = { Log.d("FAButton", "Button Clicked") } ,
//            modifier = Modifier.padding(35.dp)
//
//            ) {
//            Icon(
//                Icons.Default.Add
//            )
//        }



    }
}



// Text Field

@Composable
fun textFieldExample(){

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        item {
            BasicTextField(
                value = "Hellow",
                onValueChange = {}
                )
        }
    }

}

