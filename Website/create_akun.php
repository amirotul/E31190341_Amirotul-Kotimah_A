<?php 
	include_once('connection.php'); 


	$username =$_POST['username'];
	$email=$_POST['email'];
	$nama=$_POST['name'];
	$password=$_POST['password'];


	$insert = "INSERT INTO users(username, email, nama, password) VALUES ('$username','$email','$nama','$password')";

	$exeinsert = mysqli_query($koneksi,$insert);

	$response = array();

	if($exeinsert)
	{
		$response['code'] =1;
		$response['message'] = "Success ! Data di tambahkan";
	}
	else
	{
		$response['code'] =0;
		$response['message'] = "Failed ! Data Gagal di tambahkan";
	}

		echo json_encode($response);

 ?>