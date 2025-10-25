package com.example.myapplication.ui.theme




@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(horizontal = 24.dp, vertical = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.Profil),
            contentDescription = stringResource(id = R.string.imagedesc),
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            SocialIcon(iconResId = R.drawable.facebook)
            SocialIcon(iconResId = R.drawable.telegram)
            SocialIcon(iconResId = R.drawable.instagram)
            SocialIcon(iconResId = R.drawable.linkedin)
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(id = R.string.name),
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.usn),
            color = Color.Gray,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
    }
}




