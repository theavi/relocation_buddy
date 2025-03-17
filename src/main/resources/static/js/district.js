$(document).ready(function(){
    console.log("DISTRICT JS FILE LOADED");
    $('#updateDistrictBtn').click(function(){
         var row=$(this).closest('tr');  // current row
         var name=row.find('td').eq(2).text(); // find column first
         console.log(name);
         $('#districtUpdateName').val(name);

          $('#updateModelDistrictBtn').click(function(){
            var id=row.find('td').eq(0).text();
            var updatedName=$('#districtUpdateName').val();
            var data={
               "id":id,
               "name":updatedName
            }
             $.ajax({
                url: '/district/update',
                type: 'PUT',
                data:JSON.stringify(data),
                contentType:"application/json",
                success : function(result){
                    console.log("Record updated");
                    location.href = "/district/create";
                },
                error: function(xhr,status, message){
                    console.log("Something went wrong");
                }
            })
          });

    });
});