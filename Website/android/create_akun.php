<?php 
	include_once('connection.php'); 


	$username =$_POST['username'];
	$password=$_POST['password'];
	$nama=$_POST['name'];
	$email=$_POST['email'];



	$insert = "INSERT INTO users(username, password, name, email ) VALUES ('$username','$password','$nama','$email')";

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