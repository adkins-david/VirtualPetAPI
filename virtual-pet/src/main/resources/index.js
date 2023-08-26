const endpoints = [
    'https:localhost:8080/main/java/com/wcci/amazon/b4/virtualpet/{id}',
    'https:localhost:8080/main/java/com/wcci/amazon/b4/virtualpet/add/{id}',
    'https:localhost:8080//main/java/com/wcci/amazon/b4/virtualpet/delete/{id}'

]
const onSuccess = response => {
   console.log(response) 
}
const onFailure = error => {
    console.log(error)
}

console.log('initiating test...')
endpoints.forEach(request => {
    fetch(request).then(onSuccess).catch(onFailure)
})
console.log('all done!')