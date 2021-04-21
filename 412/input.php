<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <form method="post" action="input.php">
    <p>请输入成绩<input type="text" name="a">
    <p><input type="submit" value="提交" name="B1">
    </form>
    <?php 
        $n=$_POST["a"];
        if($n>=90 && $n<=100){
            echo "优秀";
        }
        if($n>=80 && $n<=90){
            echo "良好";
        }
        if($n>=60 && $n<=80){
            echo "及格";
        }
        if ($n<=60){
            echo "不及格";
        }
    ?>
</body>
</html>