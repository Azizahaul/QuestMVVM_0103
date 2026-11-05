package com.example.pertemuan8.view.uicontroller

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    //edit 1 : parameter statusUiSiswa
    statusUiSiswa: Siswa,
    onBackButtonClicked:()-> Unit
){
    //edit 2 : items Pair
    val items = listOf(
        Pair(stringResource(R.string.nama), statusUiSiswa.nama),
        Pair(stringResource(id = R.string.gender),statusUiSiswa.gender),
        Pair(stringResource(R.string.alamat), statusUiSiswa.alamat)
    )
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = { Text(stringResource(id = R.string.detail), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.purple_500)),
            )
        }) { isiRuang ->