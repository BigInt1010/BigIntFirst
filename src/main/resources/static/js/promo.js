(function() {
    function getRandomInt( min, max ) {
        return Math.floor( Math.random() * ( max - min + 1 ) ) + min;
    }

    function generateProductKey() {
        var tokens = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789",
            chars = 6,
            segments = 1,
            keyString = "";

        for( var i = 0; i < segments; i++ ) {
            var segment = "";

            for( var j = 0; j < chars; j++ ) {
                var k = getRandomInt( 0, 35 );
                segment += tokens[ k ];
            }

            keyString += segment;

            if( i < ( segments - 1 ) ) {
                keyString += "-";
            }
        }

        return keyString;

    }

    document.addEventListener( "DOMContentLoaded", function() {
        var generate = document.querySelector( "#generate" ),
            output = document.querySelector( "#code" );

        generate.addEventListener( "click", function() {

            var productKey = generateProductKey();
            output.innerHTML = productKey;
            var elem = document.getElementById("code").value = productKey;
        }, false);

    });

})();